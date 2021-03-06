/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMProceduralLink;
import com.vainolo.phd.opm.model.OPMProceduralLinkKind;

/**
 * Factory used by palette tools to create {@link OPMProceduralLink} of
 * {@link OPMProceduralLinkKind#INSTRUMENT} kind.
 */
public class OPMInstrumentLinkFactory implements CreationFactory {

  private OPMIdManager idManager;

  public OPMInstrumentLinkFactory(OPMIdManager idManager) {
    this.idManager = idManager;
  }

  @Override
  public Object getNewObject() {
    OPMProceduralLink link = OPMFactory.eINSTANCE.createOPMProceduralLink();
    link.setKind(OPMProceduralLinkKind.INSTRUMENT);
    link.setId(idManager.getNextId());
    return link;
  }

  @Override
  public Object getObjectType() {
    return OPMProceduralLink.class;
  }

}
