.class public final enum LL73$d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/t$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL73;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL73$d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LL73$d;",
        ">;",
        "Lcom/google/protobuf/t$c;"
    }
.end annotation


# static fields
.field public static final enum c:LL73$d;

.field public static final enum d:LL73$d;

.field public static final enum e:LL73$d;

.field public static final enum f:LL73$d;

.field public static final enum g:LL73$d;

.field public static final enum h:LL73$d;

.field public static final enum i:LL73$d;

.field public static final enum j:LL73$d;

.field public static final enum k:LL73$d;

.field public static final enum l:LL73$d;

.field public static final m:Lcom/google/protobuf/t$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$d<",
            "LL73$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic n:[LL73$d;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LL73$d;

    const-string v1, "HTTP_METHOD_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LL73$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LL73$d;->c:LL73$d;

    new-instance v1, LL73$d;

    const-string v3, "GET"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LL73$d;-><init>(Ljava/lang/String;II)V

    sput-object v1, LL73$d;->d:LL73$d;

    new-instance v3, LL73$d;

    const-string v5, "PUT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LL73$d;-><init>(Ljava/lang/String;II)V

    sput-object v3, LL73$d;->e:LL73$d;

    new-instance v5, LL73$d;

    const-string v7, "POST"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LL73$d;-><init>(Ljava/lang/String;II)V

    sput-object v5, LL73$d;->f:LL73$d;

    new-instance v7, LL73$d;

    const-string v9, "DELETE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, LL73$d;-><init>(Ljava/lang/String;II)V

    sput-object v7, LL73$d;->g:LL73$d;

    new-instance v9, LL73$d;

    const-string v11, "HEAD"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, LL73$d;-><init>(Ljava/lang/String;II)V

    sput-object v9, LL73$d;->h:LL73$d;

    new-instance v11, LL73$d;

    const-string v13, "PATCH"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, LL73$d;-><init>(Ljava/lang/String;II)V

    sput-object v11, LL73$d;->i:LL73$d;

    new-instance v13, LL73$d;

    const-string v15, "OPTIONS"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14, v14}, LL73$d;-><init>(Ljava/lang/String;II)V

    sput-object v13, LL73$d;->j:LL73$d;

    new-instance v15, LL73$d;

    const-string v14, "TRACE"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12, v12}, LL73$d;-><init>(Ljava/lang/String;II)V

    sput-object v15, LL73$d;->k:LL73$d;

    new-instance v14, LL73$d;

    const-string v12, "CONNECT"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10, v10}, LL73$d;-><init>(Ljava/lang/String;II)V

    sput-object v14, LL73$d;->l:LL73$d;

    const/16 v12, 0xa

    new-array v12, v12, [LL73$d;

    aput-object v0, v12, v2

    aput-object v1, v12, v4

    aput-object v3, v12, v6

    aput-object v5, v12, v8

    const/4 v0, 0x4

    aput-object v7, v12, v0

    const/4 v0, 0x5

    aput-object v9, v12, v0

    const/4 v0, 0x6

    aput-object v11, v12, v0

    const/4 v0, 0x7

    aput-object v13, v12, v0

    const/16 v0, 0x8

    aput-object v15, v12, v0

    aput-object v14, v12, v10

    sput-object v12, LL73$d;->n:[LL73$d;

    new-instance v0, LL73$d$a;

    invoke-direct {v0}, LL73$d$a;-><init>()V

    sput-object v0, LL73$d;->m:Lcom/google/protobuf/t$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LL73$d;->b:I

    return-void
.end method

.method public static a(I)LL73$d;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LL73$d;->l:LL73$d;

    return-object p0

    :pswitch_1
    sget-object p0, LL73$d;->k:LL73$d;

    return-object p0

    :pswitch_2
    sget-object p0, LL73$d;->j:LL73$d;

    return-object p0

    :pswitch_3
    sget-object p0, LL73$d;->i:LL73$d;

    return-object p0

    :pswitch_4
    sget-object p0, LL73$d;->h:LL73$d;

    return-object p0

    :pswitch_5
    sget-object p0, LL73$d;->g:LL73$d;

    return-object p0

    :pswitch_6
    sget-object p0, LL73$d;->f:LL73$d;

    return-object p0

    :pswitch_7
    sget-object p0, LL73$d;->e:LL73$d;

    return-object p0

    :pswitch_8
    sget-object p0, LL73$d;->d:LL73$d;

    return-object p0

    :pswitch_9
    sget-object p0, LL73$d;->c:LL73$d;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b()Lcom/google/protobuf/t$e;
    .locals 1

    sget-object v0, LL73$d$b;->a:Lcom/google/protobuf/t$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LL73$d;
    .locals 1

    const-class v0, LL73$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LL73$d;

    return-object p0
.end method

.method public static values()[LL73$d;
    .locals 1

    sget-object v0, LL73$d;->n:[LL73$d;

    invoke-virtual {v0}, [LL73$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LL73$d;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 1

    iget v0, p0, LL73$d;->b:I

    return v0
.end method
