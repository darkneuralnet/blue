.class public LyN1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyN1;->f(LHN1;Ljava/lang/Exception;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LHN1;

.field public final synthetic c:Ljava/lang/Exception;

.field public final synthetic d:LyN1;


# direct methods
.method public constructor <init>(LyN1;LHN1;Ljava/lang/Exception;)V
    .locals 0

    iput-object p1, p0, LyN1$d;->d:LyN1;

    iput-object p2, p0, LyN1$d;->b:LHN1;

    iput-object p3, p0, LyN1$d;->c:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LyN1$d;->b:LHN1;

    iget-object v1, p0, LyN1$d;->c:Ljava/lang/Exception;

    invoke-interface {v0, v1}, LHN1;->a(Ljava/lang/Exception;)V

    return-void
.end method
