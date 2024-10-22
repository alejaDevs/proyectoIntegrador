package com.certificado.ada.demo.controller.reserve;

import com.certificado.ada.demo.dto.reserve.ReserveDto;
import com.certificado.ada.demo.dto.reserve.ReserveUserBookDto;
import com.certificado.ada.demo.service.reserve.ReserveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library/reserve")
public class ReserveController {

    private final ReserveService reserveService;

    public ReserveController(ReserveService reserveService) {
        this.reserveService = reserveService;
    }

    @PostMapping
    public ResponseEntity<ReserveUserBookDto> doReserve(@RequestBody ReserveDto reserveDto){
        return new ResponseEntity<>(reserveService.doReserve(reserveDto.getIdUser(), reserveDto.getIdBook()), HttpStatus.OK);
    }
}
