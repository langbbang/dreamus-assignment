package me.songha.assignment.voucher;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class VoucherService {
    private final VoucherRepository voucherRepository;

    public VoucherDto getVoucher(Long id) {
        return VoucherDto.builder().voucher(
                        voucherRepository.findById(id)
                                .orElseThrow(() -> new VoucherNotFoundException(id))).build();
    }
}
