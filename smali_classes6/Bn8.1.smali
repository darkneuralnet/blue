.class public final LBn8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LGv8;

.field public final synthetic c:LPn8;


# direct methods
.method public constructor <init>(LPn8;LGv8;)V
    .locals 0

    iput-object p1, p0, LBn8;->c:LPn8;

    iput-object p2, p0, LBn8;->b:LGv8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LBn8;->c:LPn8;

    iget-object v1, p0, LBn8;->b:LGv8;

    invoke-static {v0, v1}, LPn8;->b(LPn8;LGv8;)V

    iget-object v0, p0, LBn8;->c:LPn8;

    iget-object v1, p0, LBn8;->b:LGv8;

    iget-object v1, v1, LGv8;->g:Lcom/google/android/gms/internal/measurement/zzcl;

    invoke-virtual {v0, v1}, LPn8;->j(Lcom/google/android/gms/internal/measurement/zzcl;)V

    return-void
.end method
