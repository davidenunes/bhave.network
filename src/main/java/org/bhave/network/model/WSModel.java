/**
 *
 * Copyright 2013 Davide Nunes Authors : Davide Nunes <davex.pt@gmail.com>
 * Website : http://davidenunes.com
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * This file is part of network-api.
 *
 * network-api is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * The network-api is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * network-api. If not, see <http://www.gnu.org/licenses/gpl.html>.
 */
package org.bhave.network.model;

import org.apache.commons.configuration.ConfigurationException;
import org.bhave.network.api.Network;

/**
 * <p>
 * Defines a network model that creates {@link Network} instances with
 * small-world properties according to the algorithm of Watts & Strogatz. The
 * model starts from a k-regular network where the nodes have a degree of
 * <i>2d</i> (<i>d</i> is an argument provided to the model) and evolve from
 * that re-wiring each link with a probability p.
 * </p>
 *
 * @author Davide Nunes
 *
 */
public interface WSModel extends NetworkModel {

    public static final String P_NUM_NODES = "numNodes";
    public static final String P_D = "d";
    public static final String P_P = "p";

    /**
     * Configures this model to generate a small-world network with a given
     * number of nodes.
     *
     * @param numNodes number of nodes in the generated network
     * @param d minimum degree for the initial seed network
     * @param p re-wiring probability 0<=p<1 this is used to generate a network
     * between a k-regular network and a random network.
     *
     * @param seed the seed to be used in the random number generator of this
     * model
     * @throws ConfigurationException if the model is not correctly configured.
     */
    void configure(int numNodes, int d, double p, long seed)
            throws ConfigurationException;

}
