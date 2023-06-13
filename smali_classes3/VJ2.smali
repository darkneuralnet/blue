.class public final synthetic LVJ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LtK2;

    invoke-static {p1}, Lco/bird/android/library/rx/scopeproviders/MapActivityScopeProvider;->a(LtK2;)LtK2;

    move-result-object p1

    return-object p1
.end method
