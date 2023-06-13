.class public final synthetic Lof6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBX5$a;


# instance fields
.field public final synthetic a:Lyf6;

.field public final synthetic b:LT96;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lyf6;LT96;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lof6;->a:Lyf6;

    iput-object p2, p0, Lof6;->b:LT96;

    iput p3, p0, Lof6;->c:I

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lof6;->a:Lyf6;

    iget-object v1, p0, Lof6;->b:LT96;

    iget v2, p0, Lof6;->c:I

    invoke-static {v0, v1, v2}, Lyf6;->h(Lyf6;LT96;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
