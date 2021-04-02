package br.com.squad44.api.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.squad44.api.controllers.form.DonationForm;
import br.com.squad44.api.controllers.form.ItemOrderForm;
import br.com.squad44.api.dto.ItemOrderDTO;

public interface ItemOrderService {

    public List<ItemOrderDTO>  getList();

    public ResponseEntity<ItemOrderDTO> register(ItemOrderForm form);

    public ResponseEntity<ItemOrderDTO> updateQuantity(DonationForm form);
    
}
