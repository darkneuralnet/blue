.class public final LtZ8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS52;


# instance fields
.field public final a:LNq9;


# direct methods
.method public constructor <init>(LNq9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LtZ8;->a:LNq9;

    return-void
.end method


# virtual methods
.method public final a(LV52;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LV52;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "LW52;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LtZ8;->a:LNq9;

    invoke-virtual {v0, p1}, LNq9;->b(LV52;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
