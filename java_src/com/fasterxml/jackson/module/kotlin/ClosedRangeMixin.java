package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\n\u001a\u00028\u0000H'¢\u0006\u0002\u0010\u0007J\r\u0010\u000b\u001a\u00028\u0000H'¢\u0006\u0002\u0010\u0007J\r\u0010\f\u001a\u00028\u0000H'¢\u0006\u0002\u0010\u0007J\r\u0010\r\u001a\u00028\u0000H'¢\u0006\u0002\u0010\u0007J\r\u0010\u000e\u001a\u00028\u0000H'¢\u0006\u0002\u0010\u0007J\r\u0010\u000f\u001a\u00028\u0000H'¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H'R\u0015\u0010\u0004\u001a\u00028\u00008\u0007¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/ClosedRangeMixin;", "T", "", "start", "endInclusive", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getEndInclusive", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStart", "getEnd", "getEndExclusive", "getFirst", "getIncrement", "getLast", "getStep", "isEmpty", "", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public abstract class ClosedRangeMixin<T> {
    private final T endInclusive;
    private final T start;

    @JsonCreator
    public ClosedRangeMixin(T t, T t2) {
        this.start = t;
        this.endInclusive = t2;
    }

    @JsonIgnore
    public abstract T getEnd();

    @JsonIgnore
    public abstract T getEndExclusive();

    @JsonProperty("end")
    public final T getEndInclusive() {
        return this.endInclusive;
    }

    @JsonIgnore
    public abstract T getFirst();

    @JsonIgnore
    public abstract T getIncrement();

    @JsonIgnore
    public abstract T getLast();

    public final T getStart() {
        return this.start;
    }

    @JsonIgnore
    public abstract T getStep();

    @JsonIgnore
    public abstract boolean isEmpty();
}
