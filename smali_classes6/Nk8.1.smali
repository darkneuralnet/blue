.class public final synthetic LNk8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# instance fields
.field public final synthetic a:Lal8;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lal8;Ljava/util/List;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNk8;->a:Lal8;

    iput-object p2, p0, LNk8;->b:Ljava/util/List;

    iput p3, p0, LNk8;->c:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 3

    iget-object v0, p0, LNk8;->a:Lal8;

    iget-object v1, p0, LNk8;->b:Ljava/util/List;

    iget v2, p0, LNk8;->c:I

    check-cast p1, LNp9;

    invoke-virtual {v0, v1, v2, p1}, Lal8;->c(Ljava/util/List;ILNp9;)LMb9;

    move-result-object p1

    return-object p1
.end method
