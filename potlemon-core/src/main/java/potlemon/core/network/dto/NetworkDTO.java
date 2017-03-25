package potlemon.core.network.dto;

import potlemon.core.network.events.NetworkEvent;
import potlemon.core.network.server.NetPackage;

import java.io.Serializable;

/**
 * Created by Pierre on 25/03/2017.
 */
public class NetworkDTO extends NetPackage implements Serializable {

    public NetworkEvent event;

    public NetworkDTOData data;

    /**
     * Sends event on network.
     *
     * @param event
     */
    public NetworkDTO(NetworkEvent event) {
        this.event = event;
    }

    public NetworkDTO(){

    }


}
