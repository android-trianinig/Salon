package com.training.apps.makeup.interfaces;



public interface Listeners {

    interface LoginListener {
        void checkDataLogin(String phone_code, String phone, String password);
    }
    interface TransFerListener {
        void checkData(String amount);
    }
    interface SkipListener
    {
        void skip();
    }
    interface CreateAccountListener
    {
        void createNewAccount();
    }

    interface ShowCountryDialogListener
    {
        void showDialog();
    }

    interface SignUpListener
    {
        void checkDataSignUp(String name, String phone_code, String phone, String email, String password);

    }
    interface EditprofileListener
    {
        void Editprofile(String name, String phone, String email, String about);

    }

    interface BackListener
    {
        void back();
    }







}
