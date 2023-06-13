.class public final Liy6$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liy6;-><init>(Llh6;LSy6;LTq4;Lcom/uber/autodispose/ScopeProvider;Le13;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/User;",
        "+",
        "LHM4<",
        "+",
        "Lco/bird/android/model/Warehouse;",
        ">;+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lio/reactivex/u<",
        "+",
        "Lkotlin/Triple<",
        "+",
        "Lco/bird/android/model/User;",
        "+",
        "Lco/bird/android/model/Warehouse;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0008\u001a\u00ba\u0001\u0012V\u0008\u0001\u0012R\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*(\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000 \u0002*\\\u0012V\u0008\u0001\u0012R\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*(\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00070\u000728\u0010\u0006\u001a4\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0014\u0012\u0012\u0012\u000e\u0008\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00040\u00040\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lco/bird/android/model/User;",
        "kotlin.jvm.PlatformType",
        "LHM4;",
        "Lco/bird/android/model/Warehouse;",
        "",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/u;",
        "a",
        "(Lkotlin/Triple;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Liy6$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Liy6$e;

    invoke-direct {v0}, Liy6$e;-><init>()V

    sput-object v0, Liy6$e;->g:Liy6$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)Lio/reactivex/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/User;",
            "LHM4<",
            "+",
            "Lco/bird/android/model/Warehouse;",
            ">;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lio/reactivex/u<",
            "+",
            "Lkotlin/Triple<",
            "Lco/bird/android/model/User;",
            "Lco/bird/android/model/Warehouse;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/User;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LHM4;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {v1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/Warehouse;

    invoke-virtual {v1}, LHM4;->f()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v1, Lkotlin/Triple;

    invoke-direct {v1, v0, v2, p1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Liy6$e;->a(Lkotlin/Triple;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
