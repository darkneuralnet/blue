.class public final synthetic Lcom/skydoves/balloon/Balloon$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/skydoves/balloon/Balloon;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I

.field public static final synthetic $EnumSwitchMapping$2:[I

.field public static final synthetic $EnumSwitchMapping$3:[I

.field public static final synthetic $EnumSwitchMapping$4:[I

.field public static final synthetic $EnumSwitchMapping$5:[I

.field public static final synthetic $EnumSwitchMapping$6:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    invoke-static {}, LDo;->values()[LDo;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, LDo;->c:LDo;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, LDo;->d:LDo;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v3, 0x2

    aput v3, v0, v1

    sget-object v1, LDo;->e:LDo;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v4, 0x3

    aput v4, v0, v1

    sget-object v1, LDo;->f:LDo;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v5, 0x4

    aput v5, v0, v1

    sput-object v0, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$0:[I

    invoke-static {}, LFo;->values()[LFo;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, LFo;->b:LFo;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v1, LFo;->c:LFo;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sput-object v0, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$1:[I

    invoke-static {}, LVw;->values()[LVw;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, LVw;->c:LVw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v1, LVw;->e:LVw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v1, LVw;->d:LVw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v4, v0, v1

    sget-object v1, LVw;->f:LVw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v5, v0, v1

    sget-object v1, LVw;->b:LVw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v6, 0x5

    aput v6, v0, v1

    sput-object v0, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$2:[I

    invoke-static {}, Lbx;->values()[Lbx;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, Lbx;->c:Lbx;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sput-object v0, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$3:[I

    invoke-static {}, LXw;->values()[LXw;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, LXw;->c:LXw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v1, LXw;->d:LXw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v1, LXw;->e:LXw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v4, v0, v1

    sget-object v1, LXw;->f:LXw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v5, v0, v1

    sput-object v0, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$4:[I

    invoke-static {}, LWw;->values()[LWw;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, LWw;->e:LWw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v1, LWw;->f:LWw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v1, LWw;->c:LWw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v4, v0, v1

    sget-object v1, LWw;->d:LWw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v5, v0, v1

    sput-object v0, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$5:[I

    invoke-static {}, LUw;->values()[LUw;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, LUw;->e:LUw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1

    sget-object v1, LUw;->f:LUw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1

    sget-object v1, LUw;->d:LUw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v4, v0, v1

    sget-object v1, LUw;->c:LUw;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v5, v0, v1

    sput-object v0, Lcom/skydoves/balloon/Balloon$b;->$EnumSwitchMapping$6:[I

    return-void
.end method
