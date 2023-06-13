.class public LJI4$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJI4$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lrz0;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:LJI4$b;


# direct methods
.method public constructor <init>(LJI4$b;Lrz0;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LJI4$b$a;->d:LJI4$b;

    iput-object p2, p0, LJI4$b$a;->b:Lrz0;

    iput-object p3, p0, LJI4$b$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LJI4$b$a;->b:Lrz0;

    iget-object v1, p0, LJI4$b$a;->c:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lrz0;->accept(Ljava/lang/Object;)V

    return-void
.end method
