.class public Lay0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lay0;->b(Lio/reactivex/y;Ldd4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ldd4;

.field public final synthetic c:Lay0;


# direct methods
.method public constructor <init>(Lay0;Ldd4;)V
    .locals 0

    iput-object p1, p0, Lay0$a;->c:Lay0;

    iput-object p2, p0, Lay0$a;->b:Ldd4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lay0$a;->b:Ldd4;

    invoke-interface {v0}, Ldd4;->release()V

    return-void
.end method
