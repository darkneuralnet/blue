package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes5.dex */
public final class AnnotatedMethodMap implements Iterable<AnnotatedMethod> {
    protected Map<MemberKey, AnnotatedMethod> _methods;

    public AnnotatedMethodMap() {
    }

    public AnnotatedMethod find(String str, Class<?>[] clsArr) {
        Map<MemberKey, AnnotatedMethod> map = this._methods;
        if (map == null) {
            return null;
        }
        return map.get(new MemberKey(str, clsArr));
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotatedMethod> iterator() {
        Map<MemberKey, AnnotatedMethod> map = this._methods;
        if (map == null) {
            return Collections.emptyIterator();
        }
        return map.values().iterator();
    }

    public int size() {
        Map<MemberKey, AnnotatedMethod> map = this._methods;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public AnnotatedMethodMap(Map<MemberKey, AnnotatedMethod> map) {
        this._methods = map;
    }

    public AnnotatedMethod find(Method method) {
        Map<MemberKey, AnnotatedMethod> map = this._methods;
        if (map == null) {
            return null;
        }
        return map.get(new MemberKey(method));
    }
}
