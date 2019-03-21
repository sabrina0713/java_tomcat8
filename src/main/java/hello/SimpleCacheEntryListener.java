import java.io.Serializable;

import javax.cache.event.CacheEntryCreatedListener;
import javax.cache.event.CacheEntryEvent;
import javax.cache.event.CacheEntryListenerException;
import javax.cache.event.CacheEntryUpdatedListener;
public class SimpleCacheEntryListener implements
  CacheEntryCreatedListener<String, String>,
  CacheEntryUpdatedListener<String, String>,
  Serializable {
     
    private boolean updated;
    private boolean created;
     
    // standard getters
     
    public void onUpdated(
      Iterable<CacheEntryEvent<? extends String,
      ? extends String>> events) throws CacheEntryListenerException {
        this.updated = true;
    }
     
    public void onCreated(
      Iterable<CacheEntryEvent<? extends String,
      ? extends String>> events) throws CacheEntryListenerException {
        this.created = true;
    }
}