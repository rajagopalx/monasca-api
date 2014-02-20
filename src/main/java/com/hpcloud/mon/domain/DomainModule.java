package com.hpcloud.mon.domain;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.hpcloud.mon.domain.model.version.VersionRepository;
import com.hpcloud.mon.domain.service.impl.VersionRepositoryImpl;

/**
 * Domain layer bindings.
 * 
 * @author Jonathan Halterman
 */
public class DomainModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(VersionRepository.class).to(VersionRepositoryImpl.class).in(Singleton.class);
  }
}
