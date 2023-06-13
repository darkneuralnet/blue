.class public final synthetic Ls21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lz21;


# direct methods
.method public synthetic constructor <init>(ZLz21;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ls21;->a:Z

    iput-object p2, p0, Ls21;->b:Lz21;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 2

    iget-boolean v0, p0, Ls21;->a:Z

    iget-object v1, p0, Ls21;->b:Lz21;

    invoke-static {v0, v1, p1}, Lz21;->n(ZLz21;Ljava/lang/Exception;)V

    return-void
.end method
