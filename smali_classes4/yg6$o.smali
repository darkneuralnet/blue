.class public final Lyg6$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyg6;-><init>(Llh6;Lkg6;LVg6;LTq4;LEa;LRh6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/Map<",
        "Lco/bird/android/model/AgreementKey;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Agreement;",
        ">;>;",
        "Ljava/util/Map<",
        "Lco/bird/android/model/AgreementKey;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Agreement;",
        ">;>;",
        "Ljava/util/Map<",
        "Lco/bird/android/model/AgreementKey;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Agreement;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "Lco/bird/android/model/AgreementKey;",
        "",
        "Lco/bird/android/model/Agreement;",
        "oldAgreements",
        "newAgreements",
        "a",
        "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lyg6$o;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyg6$o;

    invoke-direct {v0}, Lyg6$o;-><init>()V

    sput-object v0, Lyg6$o;->g:Lyg6$o;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lco/bird/android/model/AgreementKey;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/Agreement;",
            ">;>;",
            "Ljava/util/Map<",
            "Lco/bird/android/model/AgreementKey;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/Agreement;",
            ">;>;)",
            "Ljava/util/Map<",
            "Lco/bird/android/model/AgreementKey;",
            "Ljava/util/List<",
            "Lco/bird/android/model/Agreement;",
            ">;>;"
        }
    .end annotation

    const-string v0, "oldAgreements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newAgreements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lyg6$o;->a(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
