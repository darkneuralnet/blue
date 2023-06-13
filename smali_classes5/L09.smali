.class public final LL09;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LV09;

.field public b:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic c(LL09;)LV09;
    .locals 0

    iget-object p0, p0, LL09;->a:LV09;

    return-object p0
.end method

.method public static bridge synthetic e(LL09;)Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, LL09;->b:Ljava/lang/Integer;

    return-object p0
.end method


# virtual methods
.method public final a(LV09;)LL09;
    .locals 0

    iput-object p1, p0, LL09;->a:LV09;

    return-object p0
.end method

.method public final b(Ljava/lang/Integer;)LL09;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LL09;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public final d()Lo19;
    .locals 2

    new-instance v0, Lo19;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo19;-><init>(LL09;Le19;)V

    return-object v0
.end method
