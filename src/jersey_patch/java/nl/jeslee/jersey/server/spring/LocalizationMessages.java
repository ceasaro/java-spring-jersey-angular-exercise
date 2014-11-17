package nl.jeslee.jersey.server.spring;

import org.glassfish.jersey.internal.l10n.Localizable;
import org.glassfish.jersey.internal.l10n.LocalizableMessageFactory;
import org.glassfish.jersey.internal.l10n.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 *
 */
public final class LocalizationMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("org.glassfish.jersey.server.spring.localization");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableSPRING_COMPONENT_PROVIDER_INITIALIZED() {
        return messageFactory.getMessage("spring.component.provider.initialized");
    }

    /**
     * Spring component provider initialized.
     *
     */
    public static String SPRING_COMPONENT_PROVIDER_INITIALIZED() {
        return localizer.localize(localizableSPRING_COMPONENT_PROVIDER_INITIALIZED());
    }

    public static Localizable localizableBEAN_REGISTERED(Object arg0) {
        return messageFactory.getMessage("bean.registered", arg0);
    }

    /**
     * Spring managed bean, {0}, registered with HK2.
     *
     */
    public static String BEAN_REGISTERED(Object arg0) {
        return localizer.localize(localizableBEAN_REGISTERED(arg0));
    }

    public static Localizable localizableREGISTERING_CTX_LOADER_LISTENER() {
        return messageFactory.getMessage("registering.ctx.loader.listener");
    }

    /**
     * Registering Spring ContextLoaderListener
     *
     */
    public static String REGISTERING_CTX_LOADER_LISTENER() {
        return localizer.localize(localizableREGISTERING_CTX_LOADER_LISTENER());
    }

    public static Localizable localizableCTX_LOOKUP_SUCESSFUL() {
        return messageFactory.getMessage("ctx.lookup.sucessful");
    }

    /**
     * Spring context lookup done.
     *
     */
    public static String CTX_LOOKUP_SUCESSFUL() {
        return localizer.localize(localizableCTX_LOOKUP_SUCESSFUL());
    }

    public static Localizable localizableCTX_LOOKUP_STARTED() {
        return messageFactory.getMessage("ctx.lookup.started");
    }

    /**
     * Spring context lookup started.
     *
     */
    public static String CTX_LOOKUP_STARTED() {
        return localizer.localize(localizableCTX_LOOKUP_STARTED());
    }

    public static Localizable localizableNOT_IN_REQUEST_SCOPE() {
        return messageFactory.getMessage("not.in.request.scope");
    }

    /**
     * Cannot ask for request attributes - request is not active anymore!
     *
     */
    public static String NOT_IN_REQUEST_SCOPE() {
        return localizer.localize(localizableNOT_IN_REQUEST_SCOPE());
    }

    public static Localizable localizableSKIPPING_CTX_LODAER_LISTENER_REGISTRATION() {
        return messageFactory.getMessage("skipping.ctx.lodaer.listener.registration");
    }

    /**
     * Presuming Spring ContextLoaderListener was manually registered. Skipping context loader registration.
     *
     */
    public static String SKIPPING_CTX_LODAER_LISTENER_REGISTRATION() {
        return localizer.localize(localizableSKIPPING_CTX_LODAER_LISTENER_REGISTRATION());
    }

    public static Localizable localizableCTX_LOOKUP_FAILED() {
        return messageFactory.getMessage("ctx.lookup.failed");
    }

    /**
     * Spring context lookup failed, skipping spring component provider initialization.
     *
     */
    public static String CTX_LOOKUP_FAILED() {
        return localizer.localize(localizableCTX_LOOKUP_FAILED());
    }

    public static Localizable localizableNO_BEANS_FOUND_FOR_TYPE(Object arg0) {
        return messageFactory.getMessage("no.beans.found.for.type", arg0);
    }

    /**
     * No beans found. Resolution failed for type {0}.
     *
     */
    public static String NO_BEANS_FOUND_FOR_TYPE(Object arg0) {
        return localizer.localize(localizableNO_BEANS_FOUND_FOR_TYPE(arg0));
    }

    public static Localizable localizableNONE_OR_MULTIPLE_BEANS_AVAILABLE(Object arg0) {
        return messageFactory.getMessage("none.or.multiple.beans.available", arg0);
    }

    /**
     * None or multiple beans found in Spring context for type {0}, skipping the type.
     *
     */
    public static String NONE_OR_MULTIPLE_BEANS_AVAILABLE(Object arg0) {
        return localizer.localize(localizableNONE_OR_MULTIPLE_BEANS_AVAILABLE(arg0));
    }

}
