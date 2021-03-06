package tech.wetech.weshop.order.service;

import tech.wetech.weshop.common.service.IService;
import tech.wetech.weshop.order.dto.CartCheckoutDTO;
import tech.wetech.weshop.order.dto.CartParamDTO;
import tech.wetech.weshop.order.dto.CartResultDTO;
import tech.wetech.weshop.order.po.Cart;

public interface CartService extends IService<Cart> {

    CartResultDTO getCart();

    void addGoodsToCart(CartParamDTO cartParamDTO);

    void updateGoods(CartParamDTO cartParamDTO);

    CartCheckoutDTO checkoutCart(Integer addressId, Integer couponId);

}
