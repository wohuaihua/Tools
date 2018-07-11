/**
 * 
 */
package com.meyacom.ruleapp.ext.service;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author MAXiaoqiang
 *
 */
public class MapAdapter extends XmlAdapter<MapElements[], Map<String, Object>> {

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(java.lang.Object)
     */
    @Override
    public Map<String, Object> unmarshal(MapElements[] v) throws Exception {
        Map<String, Object> r = new HashMap<String, Object>();
        for (MapElements mapelement : v) {
            r.put(mapelement.key, mapelement.value);
        }
        return r;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * javax.xml.bind.annotation.adapters.XmlAdapter#marshal(java.lang.Object)
     */
    @Override
    public MapElements[] marshal(Map<String, Object> v) throws Exception {
        MapElements[] mapElements = new MapElements[v.size()];
        int i = 0;
        for (Map.Entry<String, Object> entry : v.entrySet()) {
            mapElements[i++] = new MapElements(entry.getKey(), entry.getValue());
        }
        return mapElements;
    }

}
