class upOrDown {
    public void adjustTemp(Heater heater){
        if (heater.getTempActu()< heater.getTempTarg()){
            while (heater.getTempActu()!= heater.getTempTarg()){
                heater.setTempActu(heater.getTempActu()+1);
            }
        }else {
            while (heater.getTempActu()!= heater.getTempTarg()){
                heater.setTempActu(heater.getTempActu()-1);
            }
        }
    }
}
