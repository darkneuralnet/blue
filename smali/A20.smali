.class public abstract LA20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LiV2;
.implements Lch3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008 \u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000cR(\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00078D@BX\u0084\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000b\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\n8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "LA20;",
        "LiV2;",
        "Lch3;",
        "LpV2;",
        "scope",
        "",
        "o0",
        "Lnm2;",
        "coordinates",
        "t",
        "LC20;",
        "b",
        "LC20;",
        "defaultParent",
        "c",
        "localParent",
        "<set-?>",
        "d",
        "Lnm2;",
        "()Lnm2;",
        "layoutCoordinates",
        "g",
        "()LC20;",
        "parent",
        "<init>",
        "(LC20;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBringIntoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoView.kt\nandroidx/compose/foundation/relocation/BringIntoViewChildModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LC20;

.field public c:LC20;

.field public d:Lnm2;


# direct methods
.method public constructor <init>(LC20;)V
    .locals 1

    const-string v0, "defaultParent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA20;->b:LC20;

    return-void
.end method


# virtual methods
.method public final b()Lnm2;
    .locals 3

    iget-object v0, p0, LA20;->d:Lnm2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lnm2;->F()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final g()LC20;
    .locals 1

    iget-object v0, p0, LA20;->c:LC20;

    if-nez v0, :cond_0

    iget-object v0, p0, LA20;->b:LC20;

    :cond_0
    return-object v0
.end method

.method public o0(LpV2;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LB20;->a()LV94;

    move-result-object v0

    invoke-interface {p1, v0}, LpV2;->a(LhV2;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC20;

    iput-object p1, p0, LA20;->c:LC20;

    return-void
.end method

.method public t(Lnm2;)V
    .locals 1

    const-string v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LA20;->d:Lnm2;

    return-void
.end method
