.class public LSx1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSx1;->e(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LSx1;


# direct methods
.method public constructor <init>(LSx1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LSx1$a;->c:LSx1;

    iput-object p2, p0, LSx1$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, LSx1$a;->c:LSx1;

    invoke-static {v0}, LSx1;->a(LSx1;)LoL3;

    move-result-object v0

    iget-object v1, p0, LSx1$a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "tracking/events"

    invoke-virtual {v0, v3, v1, v2}, LyN1;->e(Ljava/lang/String;Ljava/lang/String;LHN1;)V

    return-void
.end method
