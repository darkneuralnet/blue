.class public LI21$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxy0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI21;->b(LAG;)Lxy0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LAG;


# direct methods
.method public constructor <init>(LAG;)V
    .locals 0

    iput-object p1, p0, LI21$a;->a:LAG;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lke5$a;)V
    .locals 1

    iget-object v0, p0, LI21$a;->a:LAG;

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method
