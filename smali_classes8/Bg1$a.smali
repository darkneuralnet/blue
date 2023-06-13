.class public LBg1$a;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBg1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "LBg1$c;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:LBg1;


# direct methods
.method public constructor <init>(LBg1;)V
    .locals 0

    iput-object p1, p0, LBg1$a;->a:LBg1;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LBg1$c;
    .locals 1

    new-instance v0, LBg1$c;

    invoke-direct {v0}, LBg1$c;-><init>()V

    return-object v0
.end method

.method public bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LBg1$a;->a()LBg1$c;

    move-result-object v0

    return-object v0
.end method
