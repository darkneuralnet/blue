.class public LUI4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUI4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LUI4;


# direct methods
.method public constructor <init>(LUI4;)V
    .locals 0

    iput-object p1, p0, LUI4$a;->b:LUI4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LUI4$a;->b:LUI4;

    iget-object v1, v0, LUI4;->d:Lwq2;

    invoke-interface {v1, v0}, Lwq2;->a(LCq2;)V

    return-void
.end method
