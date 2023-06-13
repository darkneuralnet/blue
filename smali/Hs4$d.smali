.class public LHs4$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHs4;->y(LHs4$i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lrz0;

.field public final synthetic b:LHs4;


# direct methods
.method public constructor <init>(LHs4;Lrz0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LHs4$d;->b:LHs4;

    iput-object p2, p0, LHs4$d;->a:Lrz0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
