package com.inditex.locm.hccomprasuno.model.lib.gestionentregas.impl.ckp.entregaslogistica.services.adapters;

import java.util.List;

import org.mapstruct.Mapper;

import com.inditex.locm.hccomprasuno.model.lib.gestionentregas.api.ckp.dto.PedidoLogisticaPkDTO;
import com.inditex.locm.hccomprasuno.model.lib.gestionentregas.impl.ckp.db.entities.tcsumariapedido.TcSumariaPedido;

@Mapper
public interface TcSumariaPedidoMapper {

    PedidoLogisticaPkDTO adaptToPedidoLogisticaPkDto(TcSumariaPedido origin);

    List<PedidoLogisticaPkDTO> adaptToPedidoLogisticaPkDto(List<TcSumariaPedido> origin);

    // TCSumariaPedidoDTO adaptToTcSumariaPedidoDto(TcSumariaPedido origin);

    // List<TCSumariaPedidoDTO> adaptToSumariaPedidoDto(List<TcSumariaPedido> origin);

}
