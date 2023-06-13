.class public final enum Lco/bird/android/app/feature/physicallock/smartlock/c$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/physicallock/smartlock/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/bird/android/app/feature/physicallock/smartlock/c$b;",
        ">;",
        "Lco/bird/android/widget/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B/\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0008\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0004\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016j\u0002\u0008\u001aj\u0002\u0008\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lco/bird/android/app/feature/physicallock/smartlock/c$b;",
        "",
        "Lco/bird/android/widget/d;",
        "",
        "b",
        "I",
        "a",
        "()Ljava/lang/Integer;",
        "text",
        "c",
        "Ljava/lang/Integer;",
        "getColor",
        "color",
        "",
        "d",
        "Z",
        "()Z",
        "center",
        "Lco/bird/android/model/constant/PhysicalLockPurpose;",
        "e",
        "Lco/bird/android/model/constant/PhysicalLockPurpose;",
        "j",
        "()Lco/bird/android/model/constant/PhysicalLockPurpose;",
        "purpose",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/Integer;ZLco/bird/android/model/constant/PhysicalLockPurpose;)V",
        "f",
        "g",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum f:Lco/bird/android/app/feature/physicallock/smartlock/c$b;

.field public static final enum g:Lco/bird/android/app/feature/physicallock/smartlock/c$b;

.field public static final synthetic h:[Lco/bird/android/app/feature/physicallock/smartlock/c$b;


# instance fields
.field public final b:I

.field public final c:Ljava/lang/Integer;

.field public final d:Z

.field public final e:Lco/bird/android/model/constant/PhysicalLockPurpose;


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v7, Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    const-string v1, "HELMET"

    const/4 v2, 0x0

    sget v3, Lnl4;->smartlock_lock_purpose_helmet:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    sget-object v6, Lco/bird/android/model/constant/PhysicalLockPurpose;->HELMET:Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lco/bird/android/app/feature/physicallock/smartlock/c$b;-><init>(Ljava/lang/String;IILjava/lang/Integer;ZLco/bird/android/model/constant/PhysicalLockPurpose;)V

    sput-object v7, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->f:Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    new-instance v0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    const-string v9, "LOCK_TO"

    const/4 v10, 0x1

    sget v11, Lnl4;->smartlock_lock_purpose_lock_to:I

    const/4 v12, 0x0

    const/4 v13, 0x1

    sget-object v14, Lco/bird/android/model/constant/PhysicalLockPurpose;->LOCK_TO:Lco/bird/android/model/constant/PhysicalLockPurpose;

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Lco/bird/android/app/feature/physicallock/smartlock/c$b;-><init>(Ljava/lang/String;IILjava/lang/Integer;ZLco/bird/android/model/constant/PhysicalLockPurpose;)V

    sput-object v0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->g:Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    invoke-static {}, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->f()[Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    move-result-object v0

    sput-object v0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->h:[Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/Integer;ZLco/bird/android/model/constant/PhysicalLockPurpose;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Integer;",
            "Z",
            "Lco/bird/android/model/constant/PhysicalLockPurpose;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->b:I

    iput-object p4, p0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->c:Ljava/lang/Integer;

    iput-boolean p5, p0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->d:Z

    iput-object p6, p0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->e:Lco/bird/android/model/constant/PhysicalLockPurpose;

    return-void
.end method

.method public static final synthetic f()[Lco/bird/android/app/feature/physicallock/smartlock/c$b;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    const/4 v1, 0x0

    sget-object v2, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->f:Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->g:Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lco/bird/android/app/feature/physicallock/smartlock/c$b;
    .locals 1

    const-class v0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    return-object p0
.end method

.method public static values()[Lco/bird/android/app/feature/physicallock/smartlock/c$b;
    .locals 1

    sget-object v0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->h:[Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/bird/android/app/feature/physicallock/smartlock/c$b;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->d:Z

    return v0
.end method

.method public c()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->e(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->f(Lco/bird/android/widget/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->j(Lco/bird/android/widget/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->h(Lco/bird/android/widget/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public getIcon()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->c(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->d(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->g(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lco/bird/android/model/constant/PhysicalLockPurpose;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/c$b;->e:Lco/bird/android/model/constant/PhysicalLockPurpose;

    return-object v0
.end method
