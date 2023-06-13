.class public final Lyv0$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyv0;-><init>(LOh;LTg6;Lgl;LTq4;LGI3;Ldr4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Lco/bird/android/model/MobilePartner;",
        ">;",
        "Ljava/lang/Iterable<",
        "+",
        "Lco/bird/android/model/MobilePartner;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0010\u001c\n\u0002\u0008\u0002\u0010\u0008\u001a&\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00030\u0003 \u0006*\u0012\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0008\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "",
        "",
        "Lco/bird/android/model/PartnerId;",
        "Lco/bird/android/model/MobilePartner;",
        "partners",
        "",
        "kotlin.jvm.PlatformType",
        "",
        "a",
        "(Ljava/util/Map;)Ljava/lang/Iterable;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lyv0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyv0$a;

    invoke-direct {v0}, Lyv0$a;-><init>()V

    sput-object v0, Lyv0$a;->g:Lyv0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/MobilePartner;",
            ">;)",
            "Ljava/lang/Iterable<",
            "Lco/bird/android/model/MobilePartner;",
            ">;"
        }
    .end annotation

    const-string v0, "partners"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lyv0$a;->a(Ljava/util/Map;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
