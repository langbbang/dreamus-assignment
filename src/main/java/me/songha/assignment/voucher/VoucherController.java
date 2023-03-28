package me.songha.assignment.voucher;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping(name = "/voucher")
@RestController
public class VoucherController {
    private final VoucherService voucherService;

    @GetMapping(name = "/id/{id}")
    public VoucherDto getVoucher(@PathVariable Long id) {
        return voucherService.getVoucher(id);
    }

}
