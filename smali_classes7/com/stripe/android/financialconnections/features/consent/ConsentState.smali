.class public final Lcom/stripe/android/financialconnections/features/consent/ConsentState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAN2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;,
        Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;,
        Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0080\u0008\u0018\u00002\u00020\u0001:\u0003*+,BM\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0008\u0012\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0002\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008(\u0010)J\u000f\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\u000f\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0008H\u00c6\u0003J\u000f\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0002H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003JO\u0010\u0013\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00022\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003R\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0010\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010!\u001a\u0004\u0008\"\u0010#R\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u001b\u001a\u0004\u0008$\u0010\u001dR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010%\u001a\u0004\u0008&\u0010\'\u00a8\u0006-"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState;",
        "LAN2;",
        "Ldp;",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
        "component1",
        "",
        "",
        "component2",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;",
        "component3",
        "",
        "component4",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;",
        "component5",
        "consent",
        "merchantLogos",
        "currentBottomSheet",
        "acceptConsent",
        "viewEffect",
        "copy",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "Ldp;",
        "getConsent",
        "()Ldp;",
        "Ljava/util/List;",
        "getMerchantLogos",
        "()Ljava/util/List;",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;",
        "getCurrentBottomSheet",
        "()Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;",
        "getAcceptConsent",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;",
        "getViewEffect",
        "()Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;",
        "<init>",
        "(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;)V",
        "BottomSheetContent",
        "Payload",
        "ViewEffect",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final acceptConsent:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final consent:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
            ">;"
        }
    .end annotation
.end field

.field private final currentBottomSheet:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

.field private final merchantLogos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final viewEffect:Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;",
            "Ldp<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;",
            ")V"
        }
    .end annotation

    const-string v0, "consent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantLogos"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentBottomSheet"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptConsent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->consent:Ldp;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->merchantLogos:Ljava/util/List;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->currentBottomSheet:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->acceptConsent:Ldp;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->viewEffect:Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;

    return-void
.end method

.method public synthetic constructor <init>(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    sget-object p1, LMd6;->e:LMd6;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    sget-object p3, Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;->DATA:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    sget-object p4, LMd6;->e:LMd6;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    const/4 p5, 0x0

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-direct/range {p2 .. p7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/consent/ConsentState;Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->consent:Ldp;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->merchantLogos:Ljava/util/List;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->currentBottomSheet:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->acceptConsent:Ldp;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->viewEffect:Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->copy(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->consent:Ldp;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->merchantLogos:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->currentBottomSheet:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

    return-object v0
.end method

.method public final component4()Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldp<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->acceptConsent:Ldp;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->viewEffect:Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;

    return-object v0
.end method

.method public final copy(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;)Lcom/stripe/android/financialconnections/features/consent/ConsentState;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;",
            "Ldp<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;",
            ")",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState;"
        }
    .end annotation

    const-string v0, "consent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantLogos"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentBottomSheet"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acceptConsent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;-><init>(Ldp;Ljava/util/List;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Ldp;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->consent:Ldp;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->consent:Ldp;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->merchantLogos:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->merchantLogos:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->currentBottomSheet:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->currentBottomSheet:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->acceptConsent:Ldp;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->acceptConsent:Ldp;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->viewEffect:Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->viewEffect:Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAcceptConsent()Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldp<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->acceptConsent:Ldp;

    return-object v0
.end method

.method public final getConsent()Ldp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->consent:Ldp;

    return-object v0
.end method

.method public final getCurrentBottomSheet()Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->currentBottomSheet:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

    return-object v0
.end method

.method public final getMerchantLogos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->merchantLogos:Ljava/util/List;

    return-object v0
.end method

.method public final getViewEffect()Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->viewEffect:Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->consent:Ldp;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->merchantLogos:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->currentBottomSheet:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->acceptConsent:Ldp;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->viewEffect:Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->consent:Ldp;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->merchantLogos:Ljava/util/List;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->currentBottomSheet:Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->acceptConsent:Ldp;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->viewEffect:Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ConsentState(consent="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", merchantLogos="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentBottomSheet="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", acceptConsent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", viewEffect="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
