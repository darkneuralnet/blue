.class public final synthetic Lam9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lmm9;

.field public final synthetic c:Le49;

.field public final synthetic d:Lvd9;


# direct methods
.method public synthetic constructor <init>(Lmm9;Le49;Lvd9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lam9;->b:Lmm9;

    iput-object p2, p0, Lam9;->c:Le49;

    iput-object p3, p0, Lam9;->d:Lvd9;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lam9;->b:Lmm9;

    iget-object v1, p0, Lam9;->c:Le49;

    iget-object v2, p0, Lam9;->d:Lvd9;

    invoke-virtual {v0, v1, v2}, Lmm9;->g(Le49;Lvd9;)V

    return-void
.end method
