package com.fincatto.nfe.classes;

import org.junit.Assert;
import org.junit.Test;

public class NFTipoTest {

    @Test
    public void deveObterTipoApartirDoSeuCodigo() {
        Assert.assertEquals(NFTipo.ENTRADA, NFTipo.valueOfCodigo("0"));
        Assert.assertEquals(NFTipo.SAIDA, NFTipo.valueOfCodigo("1"));
        Assert.assertNull(NFTipo.valueOfCodigo("2"));
    }

    @Test
    public void deveRepresentarOCodigoCorretamente() {
        Assert.assertEquals("0", NFTipo.ENTRADA.getCodigo());
        Assert.assertEquals("1", NFTipo.SAIDA.getCodigo());
    }
}