.class public LIR8;
.super Lns8;
.source "SourceFile"


# instance fields
.field public final b:LhV8;


# direct methods
.method public constructor <init>(LhV8;)V
    .locals 1

    invoke-virtual {p1}, LhV8;->c0()LPn8;

    move-result-object v0

    invoke-direct {p0, v0}, Lns8;-><init>(LPn8;)V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LIR8;->b:LhV8;

    return-void
.end method
