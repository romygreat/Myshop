package com.example.admin.ccb.bean;

import com.bigkoo.pickerview.model.IPickerViewData;

import java.util.List;


public class ShopPingCartBean {
    public List<ShopBean> shopList;


    public static class ShopBean implements IPickerViewData {
        public boolean isSelectShop;
        public String shopName;
        public List<CarListBean> carList;

        @Override
        public String getPickerViewText() {
            return shopName;
        }

        public static class CarListBean {
            public int count = 1;
            public String title;
            public Integer icon;
            public boolean isSelectGoods;
        }

    }

}
