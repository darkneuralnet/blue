.class public LG80$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG80;->internalSuccess(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:LG80;


# direct methods
.method public constructor <init>(LG80;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LG80$a;->c:LG80;

    iput-object p2, p0, LG80$a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LG80$a;->c:LG80;

    iget-object v1, p0, LG80$a;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, LG80;->success(Ljava/lang/Object;)V

    return-void
.end method
