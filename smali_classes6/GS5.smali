.class public final synthetic LGS5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYU5;


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LGS5;->b:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget v0, p0, LGS5;->b:I

    invoke-static {v0}, Lcom/google/common/util/concurrent/Striped;->a(I)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    return-object v0
.end method
