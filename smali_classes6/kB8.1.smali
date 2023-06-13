.class public final LkB8;
.super LJy8;
.source "SourceFile"

# interfaces
.implements Lgz8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LJy8<",
        "LkB8;",
        ">;",
        "Lgz8;"
    }
.end annotation


# static fields
.field public static final f:Lcom/google/android/gms/internal/recaptcha/zzhu;


# instance fields
.field public final e:Lcom/google/android/gms/internal/recaptcha/zzhu;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/recaptcha/zzhu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/recaptcha/zzhu;-><init>()V

    sput-object v0, LkB8;->f:Lcom/google/android/gms/internal/recaptcha/zzhu;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-static {}, LEz8;->b()LEz8;

    move-result-object v0

    invoke-virtual {v0}, LEz8;->c()Ljava/util/UUID;

    move-result-object v0

    const-string v1, ""

    invoke-direct {p0, v1, v0}, LJy8;-><init>(Ljava/lang/String;Ljava/util/UUID;)V

    sget-object v0, LkB8;->f:Lcom/google/android/gms/internal/recaptcha/zzhu;

    iput-object v0, p0, LkB8;->e:Lcom/google/android/gms/internal/recaptcha/zzhu;

    return-void
.end method


# virtual methods
.method public final D2(Ljava/lang/String;LEC8;)LPC8;
    .locals 1

    sget-object v0, LFE8;->a:LJ38;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, LkB8;->T0(Ljava/lang/String;LEC8;Z)LPC8;

    move-result-object p1

    return-object p1
.end method

.method public final T0(Ljava/lang/String;LEC8;Z)LPC8;
    .locals 1

    if-eqz p3, :cond_0

    sget-object v0, LFE8;->a:LJ38;

    :cond_0
    new-instance v0, LwB8;

    invoke-direct {v0, p1, p0, p2, p3}, LwB8;-><init>(Ljava/lang/String;Lgz8;LEC8;Z)V

    return-object v0
.end method

.method public final bridge synthetic zze()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, LkB8;->e:Lcom/google/android/gms/internal/recaptcha/zzhu;

    return-object v0
.end method
