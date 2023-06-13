package com.amazonaws.services.p026s3.model;
/* renamed from: com.amazonaws.services.s3.model.RoutingRule */
/* loaded from: classes3.dex */
public class RoutingRule {
    RoutingRuleCondition condition;
    RedirectRule redirect;

    public RoutingRuleCondition getCondition() {
        return this.condition;
    }

    public RedirectRule getRedirect() {
        return this.redirect;
    }

    public void setCondition(RoutingRuleCondition routingRuleCondition) {
        this.condition = routingRuleCondition;
    }

    public void setRedirect(RedirectRule redirectRule) {
        this.redirect = redirectRule;
    }

    public RoutingRule withCondition(RoutingRuleCondition routingRuleCondition) {
        setCondition(routingRuleCondition);
        return this;
    }

    public RoutingRule withRedirect(RedirectRule redirectRule) {
        setRedirect(redirectRule);
        return this;
    }
}
