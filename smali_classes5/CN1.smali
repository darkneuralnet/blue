.class public LCN1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWU2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LCN1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LWU2<",
        "LOC1;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Liy3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Liy3<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:LSU2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LSU2<",
            "LOC1;",
            "LOC1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x9c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"

    invoke-static {v1, v0}, Liy3;->f(Ljava/lang/String;Ljava/lang/Object;)Liy3;

    move-result-object v0

    sput-object v0, LCN1;->b:Liy3;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LCN1;-><init>(LSU2;)V

    return-void
.end method

.method public constructor <init>(LSU2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSU2<",
            "LOC1;",
            "LOC1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCN1;->a:LSU2;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LOC1;

    invoke-virtual {p0, p1}, LCN1;->d(LOC1;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILsy3;)LWU2$a;
    .locals 0

    check-cast p1, LOC1;

    invoke-virtual {p0, p1, p2, p3, p4}, LCN1;->c(LOC1;IILsy3;)LWU2$a;

    move-result-object p1

    return-object p1
.end method

.method public c(LOC1;IILsy3;)LWU2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOC1;",
            "II",
            "Lsy3;",
            ")",
            "LWU2$a<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    iget-object p2, p0, LCN1;->a:LSU2;

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3, p3}, LSU2;->a(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LOC1;

    if-nez p2, :cond_0

    iget-object p2, p0, LCN1;->a:LSU2;

    invoke-virtual {p2, p1, p3, p3, p1}, LSU2;->b(Ljava/lang/Object;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object p1, p2

    :cond_1
    :goto_0
    sget-object p2, LCN1;->b:Liy3;

    invoke-virtual {p4, p2}, Lsy3;->c(Liy3;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    new-instance p3, LWU2$a;

    new-instance p4, LPN1;

    invoke-direct {p4, p1, p2}, LPN1;-><init>(LOC1;I)V

    invoke-direct {p3, p1, p4}, LWU2$a;-><init>(Lak2;LIS0;)V

    return-object p3
.end method

.method public d(LOC1;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
