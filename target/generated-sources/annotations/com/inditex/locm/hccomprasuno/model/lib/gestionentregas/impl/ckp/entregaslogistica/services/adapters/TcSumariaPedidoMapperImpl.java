package com.inditex.locm.hccomprasuno.model.lib.gestionentregas.impl.ckp.entregaslogistica.services.adapters;

import com.inditex.locm.hccomprasuno.model.lib.gestionentregas.api.ckp.dto.PedidoLogisticaPkDTO;
import com.inditex.locm.hccomprasuno.model.lib.gestionentregas.impl.ckp.db.entities.tcsumariapedido.TcSumariaPedido;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 3.12.3.v20170228-1205, environment: Java 1.8.0_121 (Oracle Corporation)"
)
public class TcSumariaPedidoMapperImpl implements TcSumariaPedidoMapper {

    @Override
    public PedidoLogisticaPkDTO adaptToPedidoLogisticaPkDto(TcSumariaPedido origin) {
        if ( origin == null ) {
            return null;
        }

        PedidoLogisticaPkDTO pedidoLogisticaPkDTO = new PedidoLogisticaPkDTO();

        if ( origin.getIdCampana() != null ) {
            pedidoLogisticaPkDTO.setIdCampana( Integer.parseInt( origin.getIdCampana() ) );
        }
        if ( origin.getIdCentroCompra() != null ) {
            pedidoLogisticaPkDTO.setIdCentroCompra( Integer.parseInt( origin.getIdCentroCompra() ) );
        }
        pedidoLogisticaPkDTO.setIdPedido( origin.getIdPedido() );

        return pedidoLogisticaPkDTO;
    }

    @Override
    public List<PedidoLogisticaPkDTO> adaptToPedidoLogisticaPkDto(List<TcSumariaPedido> origin) {
        if ( origin == null ) {
            return null;
        }

        List<PedidoLogisticaPkDTO> list = new ArrayList<PedidoLogisticaPkDTO>( origin.size() );
        for ( TcSumariaPedido tcSumariaPedido : origin ) {
            list.add( adaptToPedidoLogisticaPkDto( tcSumariaPedido ) );
        }

        return list;
    }
}
