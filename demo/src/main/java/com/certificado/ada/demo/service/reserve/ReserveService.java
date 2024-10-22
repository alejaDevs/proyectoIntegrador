package com.certificado.ada.demo.service.reserve;

import com.certificado.ada.demo.dto.reserve.ReserveUserBookDto;

import java.time.LocalDate;

public interface ReserveService {
    ReserveUserBookDto doReserve(Long idUser, Long idBook);
}
