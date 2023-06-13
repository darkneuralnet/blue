.class public final Lcom/google/android/libraries/places/internal/zzex;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:LR96;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lia6;->f(Landroid/content/Context;)V

    invoke-static {}, Lia6;->c()Lia6;

    move-result-object p1

    const-string v0, "cct"

    invoke-virtual {p1, v0}, Lia6;->h(Ljava/lang/String;)LU96;

    move-result-object p1

    const-class v0, Lcom/google/android/libraries/places/internal/zzlg;

    sget-object v1, Lcom/google/android/libraries/places/internal/zzew;->zza:Lcom/google/android/libraries/places/internal/zzew;

    const-string v2, "LE"

    invoke-interface {p1, v2, v0, v1}, LU96;->b(Ljava/lang/String;Ljava/lang/Class;LC96;)LR96;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzex;->zza:LR96;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/libraries/places/internal/zzlg;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzex;->zza:LR96;

    invoke-static {p1}, Lyg1;->d(Ljava/lang/Object;)Lyg1;

    move-result-object p1

    invoke-interface {v0, p1}, LR96;->a(Lyg1;)V

    return-void
.end method
