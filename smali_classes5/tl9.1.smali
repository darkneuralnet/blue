.class public final Ltl9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:J

.field public c:Ljava/lang/Object;

.field public final d:Lcom/google/android/gms/internal/places/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/places/a;->b()Lcom/google/android/gms/internal/places/a;

    move-result-object v0

    iput-object v0, p0, Ltl9;->d:Lcom/google/android/gms/internal/places/a;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/places/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ltl9;->d:Lcom/google/android/gms/internal/places/a;

    return-void
.end method
