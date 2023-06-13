.class public LtT3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LtT3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:F

.field public final synthetic c:LtT3;


# direct methods
.method public constructor <init>(LtT3;JF)V
    .locals 0

    iput-object p1, p0, LtT3$a;->c:LtT3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, LtT3$a;->a:J

    iput p4, p0, LtT3$a;->b:F

    return-void
.end method
