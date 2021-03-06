package org.mitash.altdrive.remote;

import com.google.inject.AbstractModule;
import org.mitash.altdrive.drive.DriveModule;
import org.mitash.altdrive.event.EventModule;
import org.mitash.altdrive.properties.PropertiesModule;

/**
 * This module binds the necessary resources for remote watching.
 * @author jacob
 */
public class RemoteWatcherModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new PropertiesModule());
        install(new DriveModule());
        install(new EventModule());
        bind(RemoteWatcher.class).to(RemoteWatcherImpl.class);
    }
}
