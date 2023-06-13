.class public final synthetic LIM6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:LKM6;

.field public final c:LHM6;


# direct methods
.method public constructor <init>(LKM6;LHM6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIM6;->b:LKM6;

    iput-object p2, p0, LIM6;->c:LHM6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LIM6;->b:LKM6;

    iget-object v1, p0, LIM6;->c:LHM6;

    invoke-virtual {v0, v1}, LKM6;->b(LHM6;)V

    return-void
.end method
